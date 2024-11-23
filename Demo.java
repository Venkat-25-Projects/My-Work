// The Computer class and the Demo class in the same file
class Computer
{
    public void playMusic()
    {
        System.out.println("Music Playing..");
    }

    public String getMeAPen(int cost)
    {
        return "pen";
    }
}

public class Demo
{
    public static void main(String[] args)
    {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(2); // Passing argument directly
        System.out.println(str);
    }
}
