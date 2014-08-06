/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class AFor1 extends PFor1
{
    private TNumeroInt _numeroInt_;
    private PComando _comando_;

    public AFor1()
    {
        // Constructor
    }

    public AFor1(
        @SuppressWarnings("hiding") TNumeroInt _numeroInt_,
        @SuppressWarnings("hiding") PComando _comando_)
    {
        // Constructor
        setNumeroInt(_numeroInt_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AFor1(
            cloneNode(this._numeroInt_),
            cloneNode(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFor1(this);
    }

    public TNumeroInt getNumeroInt()
    {
        return this._numeroInt_;
    }

    public void setNumeroInt(TNumeroInt node)
    {
        if(this._numeroInt_ != null)
        {
            this._numeroInt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._numeroInt_ = node;
    }

    public PComando getComando()
    {
        return this._comando_;
    }

    public void setComando(PComando node)
    {
        if(this._comando_ != null)
        {
            this._comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._numeroInt_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._numeroInt_ == child)
        {
            this._numeroInt_ = null;
            return;
        }

        if(this._comando_ == child)
        {
            this._comando_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._numeroInt_ == oldChild)
        {
            setNumeroInt((TNumeroInt) newChild);
            return;
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
