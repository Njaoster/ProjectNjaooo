package codingleavesthesouldry;
//Detta program håller koll på allt som skrivs alla rader och text
class MyCounter {
//två  privata variablar skapas: rows och characters
    private int rows;

    private int characters;

    //konstruktorn ger rows och char värdet 0
    public MyCounter()
    {
        this.rows = 0;
        this.characters = 0;
    }
    //konstruktor som vi använder till test klassen.
    public MyCounter(int rad, int cha)
    {
        rows = rad ;
        characters = cha;
    }
    //method för att incrementera rader och räkna char på inputen.
    public void counter(String input)
    {
        this.rows++;
        this.characters += input.length();
    }
    //method skickar tillbaka värdena från rows och characters.
    public int getRows()
    {
        return this.rows;
    }

    public int getCharacters()
    {
        return this.characters;
    }
}

