package br.edu.ifsc.sj.ads.es1;

import java.util.stream.DoubleStream;

public class Calculator {

    static double add(double... operands)
    {
        if (operands == null || operands.length < 2)
        {
            throw new IllegalArgumentException("Operands must have at least 2 elements");
        }
        return DoubleStream.of(operands).sum();
    }

    static double multiply(double... operands)
    {
        if (operands == null || operands.length < 2)
        {
            throw new IllegalArgumentException("Operands must have at least 2 elements");
        }
        return DoubleStream.of(operands).reduce(1, (a, b) -> a * b);
    }
}
