package manxkat.teque;

public class Main {

    public static void main(String[] args) {
        InputReader reader = new InputReader(System.in);
        newTeque(reader);
    }

    public static void newTeque(InputReader reader) {
        Teque<Integer> teque = new ArrayTeque<>();

        String[] splitLine;
        while ((splitLine = reader.splitNext()).length != 0) {

            Commands command = Commands.valueOf(splitLine[0].toUpperCase());
            int value = Integer.parseInt(splitLine[1]);

            switch (command) {
                case PUSH_FRONT:
                    teque.addFirst(value);
                case PUSH_MIDDLE:
                    teque.addMiddle(value);
                case PUSH_BACK:
                    teque.addLast(value);
                case GET:
                    System.out.println(teque.toArray()[value]);
            }

        }
    }

}
