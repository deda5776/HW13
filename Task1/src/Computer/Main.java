package Computer;

import Computer.HardDisk.HardDisk;
import Computer.HardDisk.HardDiskType;
import Computer.KeyBoard.Illuminate;
import Computer.KeyBoard.KeyBoard;
import Computer.KeyBoard.KeyBoardType;
import Computer.Monitor.Monitor;
import Computer.Monitor.MonitorType;
import Computer.memory.Memory;
import Computer.memory.MemoryType;
import Computer.processor.CoreCount;
import Computer.processor.Creator;
import Computer.processor.Frequency;
import Computer.processor.Processor;

public class Main {
    public static void main(String[] args) {


        Processor processor = new Processor(Frequency.TWO_THOUSAND, CoreCount.FOUR, Creator.INTEL, 500);
        Memory memory = new Memory(MemoryType.DDR4, 16, 500);
        HardDisk hardDisk = new HardDisk(HardDiskType.SSD, 1024, 500);
        Monitor monitor = new Monitor(17, MonitorType.IPS, 500);
        KeyBoard keyBoard = new KeyBoard(KeyBoardType.WRIED, Illuminate.YES, 500);

        Computer computer = new Computer(processor, memory, hardDisk, monitor, keyBoard, "Intel", "BaseComputer");
        System.out.println(computer);
        System.out.println(computer.getWeight());


    }
}
