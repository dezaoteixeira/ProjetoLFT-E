/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class TComentadoA extends Token
{
    public TComentadoA()
    {
        super.setText("/*");
    }

    public TComentadoA(int line, int pos)
    {
        super.setText("/*");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TComentadoA(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTComentadoA(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TComentadoA text.");
    }
}
