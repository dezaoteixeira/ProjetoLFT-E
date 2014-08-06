/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class AExExplogica extends PExplogica
{
    private PExplogica _explogica_;
    private TE _e_;
    private PFatorA _fatorA_;

    public AExExplogica()
    {
        // Constructor
    }

    public AExExplogica(
        @SuppressWarnings("hiding") PExplogica _explogica_,
        @SuppressWarnings("hiding") TE _e_,
        @SuppressWarnings("hiding") PFatorA _fatorA_)
    {
        // Constructor
        setExplogica(_explogica_);

        setE(_e_);

        setFatorA(_fatorA_);

    }

    @Override
    public Object clone()
    {
        return new AExExplogica(
            cloneNode(this._explogica_),
            cloneNode(this._e_),
            cloneNode(this._fatorA_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExExplogica(this);
    }

    public PExplogica getExplogica()
    {
        return this._explogica_;
    }

    public void setExplogica(PExplogica node)
    {
        if(this._explogica_ != null)
        {
            this._explogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._explogica_ = node;
    }

    public TE getE()
    {
        return this._e_;
    }

    public void setE(TE node)
    {
        if(this._e_ != null)
        {
            this._e_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._e_ = node;
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
            + toString(this._explogica_)
            + toString(this._e_)
            + toString(this._fatorA_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._explogica_ == child)
        {
            this._explogica_ = null;
            return;
        }

        if(this._e_ == child)
        {
            this._e_ = null;
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
        if(this._explogica_ == oldChild)
        {
            setExplogica((PExplogica) newChild);
            return;
        }

        if(this._e_ == oldChild)
        {
            setE((TE) newChild);
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
