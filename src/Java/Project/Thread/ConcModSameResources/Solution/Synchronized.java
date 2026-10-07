package Java.Project.Thread.ConcModSameResources.Solution;

public class Synchronized {
    class Counter {
        int count = 0;

        synchronized void increment() {
            count++;
        }
    }

}
