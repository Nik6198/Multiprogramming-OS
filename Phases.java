
class Phases{

    public static void main(String[] args){
        int a;
        VirtualMachine vm = new VirtualMachine();
        String input=args[0];
        String output="output.txt";

        UserMode usr = new UserMode(input,output);
        usr.load(vm);
    }
}
