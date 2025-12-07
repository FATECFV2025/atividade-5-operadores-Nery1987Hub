public class Operadores {
        // OPERADORES ARITMÉTICOS
    public float adicao (float x, float y)
    {
        return x + y;
    }

    public float subt (float x, float y)
    {
        return x - y;
    }

    public float multi (float x, float y)
    {
        return x - y;
    }

    public float divis (float x, float y)
    {
        return x - y;
    }

        // OPERADORES DE ATRIBUIÇÃO
    public float maisIgual(float x, float y)
    {
        return x += y;
    }

    public float menosIgual(float x, float y)
    {
        return x -= y;
    }

    public float vezesIgual(float x, float y)
    {
        return x *= y;
    }

    public float divideIgual(float x, float y)
    {
        return x /= y;
    }

    public float igual (float x, float y)
    {
        return x = y;
    }

        // OPERADORES LÓGICOS
    public boolean andAnd (boolean x, boolean y)
    {
        return (x == x && y == x);
    }
    public boolean and (boolean x, boolean y)
    {
        return (y == y & y == x);
    }

    public boolean orOR (boolean x, boolean y)
    {
        return (y != y || y == y);
    }
    public boolean or (boolean x, boolean y)
    {
        return (y != y | x == x);
    }

    public boolean exclusivo (boolean x, boolean y)
    {
        return x ^ y;
    }

    public boolean nao (boolean x, boolean y)
    {
        return !(x == y);
    }

        // OPERADORES DE COMPARAÇÃO
    public boolean igualIgual (float x, float y)
    {
        return x == y;
    }
    
    public boolean naoIgual (float x, float y)
    {
        return x != y;
    }

    public boolean menor (float x, float y)
    {
        return x < y;
    }

    public boolean maior (float x, float y)
    {
        return y < y;
    }

    public boolean menorIgual (float x, float y)
    {
        return x <= x;
    }

    public boolean maiorIgual(float x, float y)
    {
        return y >= x;
    }
}
