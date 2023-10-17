package Polymorphism;

public class main19 {
    public static void main(String[] args) {
        Songs instr = new InstrumentalClassical("Bethoveen", "Classic", 1800, "Yes", "No");
            instr.songDetails();;
            instr.songType(instr);
                System.out.println();

        Songs modern = new Modern("One Direction", "Pop", 2010);
            System.out.println(modern);
    } 
}
