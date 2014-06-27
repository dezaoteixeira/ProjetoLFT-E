/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class AMultTermoA extends PTermoA
{
    private PTermoA _termoA_;
    private PMultA _multA_;
    private PFatorA _fatorA_;

    public AMultTermoA()
    {
        // Constructor
    }

    public AMultTermoA(
        @SuppressWarnings("hiding") PTermoA _termoA_,
        @SuppressWarnings("hiding") PMultA _multA_,
        @SuppressWarnings("hiding") PFatorA _fatorA_)
    {
        // Constructor
        setTermoA(_termoA_);

        setMultA(_multA_);

        setFatorA(_fatorA_);

    }

    @Override
    public Object clone()
    {
        return new AMultTermoA(
            cloneNode(this._termoA_),
            cloneNode(this._multA_),
            cloneNode(this._fatorA_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultTermoA(this);
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

    public PMultA getMultA()
    {
        return this._multA_;
    }

    public void setMultA(PMultA node)
    {
        if(this._multA_ != null)
        {
            this._multA_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._multA_ = node;
    }

    public PFatorA getFatorA()
    {
        return this._fatorA_;
    }

    public void setFatorA(PFatorA node)
    {
        if(this._fatorA_ != null)
        {
            this._fatorA_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fatorA_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._termoA_)
            + toString(this._multA_)
            + toString(this._fatorA_);
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

        if(this._multA_ == child)
        {
            this._multA_ = null;
            return;
        }

        if(this._fatorA_ == child)
        {
            this._fatorA_ = null;
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

        if(this._multA_ == oldChild)
        {
            setMultA((PMultA) newChild);
            return;
        }

        if(this._fatorA_ == oldChild)
        {
            setFatorA((PFatorA) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
