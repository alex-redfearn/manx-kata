package manxkat.teque;

public class Main {

    public static void main(String[] args) {
        InputReader reader = new InputReader(System.in);
        buildTeque(reader);
    }

    public static void buildTeque(InputReader reader) {
        int commands = reader.readInt();
        
        Teque<String> teque = new TequeList<>();

        for(int i = 0; i < commands; i++) {
            String[] splitLine = reader.splitLine();
            Commands command = Commands.valueOf(splitLine[0].toUpperCase());
            String value = splitLine[1];

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
                    System.out.println(teque.get(Integer.valueOf(value)));
                    break;
            }
        }
        
    }

}
