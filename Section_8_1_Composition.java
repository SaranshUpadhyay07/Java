public class Section_8_1_Composition {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "250 X 1440");
        MotherBoard theMotherboard = new MotherBoard("BJ-200", "Asus", 4, 6,"v2.44");
        Section_8_1_Computer thePC = new Section_8_1_Computer("2208", "Dell", theCase, theMonitor, theMotherboard);

        thePC.getMonitor().Color(10, 10, "Aqua");// This is composition
        thePC.getComputerCase().pressPowerButton();
        thePC.getMotherBoard().loadProgram("Windows Os");
    }
}
