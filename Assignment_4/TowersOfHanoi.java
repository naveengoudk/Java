import java.util.Scanner;
import java.util.Stack;

public class TowersOfHanoi {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of disks to be moved");
        int diskNumber = sc.nextInt();
        Tower[] myTower = new Tower[3];
        for (int i = 0; i < 3; i++) {
            myTower[i] = new Tower(i);
        }
        for (int i = diskNumber - 1; i >= 0; i--) {
            myTower[0].add(i);
        }
        myTower[0].moveDisks(diskNumber, myTower[1], myTower[2]);
    }
}

class Tower {
    int index;
    Stack<Integer> disks;

    public Tower(int i) {
        disks = new Stack<Integer>();
        index = i;
    }

    public void moveDisks(int diskNumber, Tower buffer, Tower destination) throws Exception {
        if (diskNumber > 0) {
            moveDisks(diskNumber - 1, destination, buffer);
            moveTo(destination);
            buffer.moveDisks(diskNumber - 1, this, destination);
        } else return;
    }

    private void moveTo(Tower destination) throws Exception {
        int t = disks.pop();
        destination.add(t);
        System.out.println("Now moving " + t + "from " + this.index + " to " + destination.index);
    }

    public void add(int val) throws Exception {
        if ((!disks.isEmpty()) && disks.peek() < val) {
            throw new Exception("Error placing disk " + val);
        } else {
            disks.push(val);
        }
    }

}