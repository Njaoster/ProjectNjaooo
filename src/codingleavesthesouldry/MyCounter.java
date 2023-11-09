package codingleavesthesouldry;
class MyCounter
{

    private int rows;
    private int characters;

    public MyCounter()
    {
        this.rows = 0;
        this.characters = 0;
    }

    public MyCounter(int row, int cha)
    {
        rows = row;
        characters = cha;
    }

    public void counter(String input)
    {
        this.rows++;
        this.characters += input.length();
    }

    public int getRows()
    {
        return this.rows;
    }
    public int getCharacters()
    {
        return this.characters;
    }
}

