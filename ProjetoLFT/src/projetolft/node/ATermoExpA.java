/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class ATermoExpA extends PExpA
{
    private PTermoA _termoA_;

    public ATermoExpA()
    {
        // Constructor
    }

    public ATermoExpA(
        @SuppressWarnings("hiding") PTermoA _termoA_)
    {
        // Constructor
        setTermoA(_termoA_);

    }

    @Override
    public Object clone()
    {
        return new ATermoExpA(
            cloneNode(this._termoA_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATermoExpA(this);
    }

    public PTermoA getTermoA()
    {
        return this._termoA_;
    }

    public void setTermoA(PTermoA node)
    {
        if(this._termoA_ != null)
        {
            this._termoA_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termoA_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._termoA_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._termoA_ == child)
        {
            this._termoA_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._termoA_ == oldChild)
        {
            setTermoA((PTermoA) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
