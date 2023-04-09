package manxkat.teque;

import manxkat.io.Kattio;

public class Main {

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        buildTequeFromInput(io);
    }

    public static void buildTequeFromInput(Kattio io) {
        Teque<Integer> teque = new Teque<>();
        
        int commands = io.getInt();

        for(int i = 0; i < commands; i++) {

            String word = io.getWord();
            Commands command = Commands.valueOf(word.toUpperCase());
            int value = io.getInt();            

            switch (command) {
                case PUSH_FRONT:
                    teque.addFirst(value);
                    break;

                case PUSH_MIDDLE:
                    teque.addMiddle(value);
                    break;

                case PUSH_BACK:
                    teque.addLast(value);
                    break;

                case GET:
                    io.println(teque.get(value));
                    break;
            }
        }

        io.close();
    }

}
