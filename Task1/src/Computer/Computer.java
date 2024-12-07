package Computer;

import Computer.HardDisk.HardDisk;
import Computer.KeyBoard.KeyBoard;
import Computer.Monitor.Monitor;
import Computer.memory.Memory;
import Computer.processor.Processor;

public class Computer {
    private Processor processor;
    private Memory memory;
    private HardDisk disk;
    private Monitor monitor;
    private KeyBoard keyBoard;

    private final String vendor;
    private final String name;

    public Computer(Processor processor,
                    Memory memory,
                    HardDisk disk,
                    Monitor monitor,
                    KeyBoard keyBoard,
                    String vendor,
                    String name) {
        this.processor = processor;
        this.memory = memory;
        this.disk = disk;
        this.monitor = monitor;
        this.keyBoard = keyBoard;
        this.vendor = vendor;
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisk getDisk() {
        return disk;
    }

    public void setDisk(HardDisk disk) {
        this.disk = disk;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }

    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public double getWeight(){
        return processor.getWeight() + memory.getWeight() + disk.getWeight() + monitor.getWeight() + keyBoard.getWeight();

    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", memory=" + memory +
                ", disk=" + disk +
                ", monitor=" + monitor +
                ", keyBoard=" + keyBoard +
                ", vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
