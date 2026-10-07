package Java.Project.Thread.ConcModSameResources.Solution;

    import java.util.concurrent.atomic.AtomicInteger;

    class AtomicVariable {
        AtomicInteger count = new AtomicInteger(0);

        void increment() {
            count.incrementAndGet();
        }
    }

