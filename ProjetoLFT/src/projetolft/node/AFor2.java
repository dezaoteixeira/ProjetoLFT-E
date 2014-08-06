/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class AFor2 extends PFor2
{
    private TNumeroInt _numeroInt_;
    private PFor1 _for1_;

    public AFor2()
    {
        // Constructor
    }

    public AFor2(
        @SuppressWarnings("hiding") TNumeroInt _numeroInt_,
        @SuppressWarnings("hiding") PFor1 _for1_)
    {
        // Constructor
        setNumeroInt(_numeroInt_);

        setFor1(_for1_);

    }

    @Override
    public Object clone()
    {
        return new AFor2(
            cloneNode(this._numeroInt_),
            cloneNode(this._for1_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFor2(this);
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

    public PFor1 getFor1()
    {
        return this._for1_;
    }

    public void setFor1(PFor1 node)
    {
        if(this._for1_ != null)
        {
            this._for1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._for1_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._numeroInt_)
            + toString(this._for1_);
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

        if(this._for1_ == child)
        {
            this._for1_ = null;
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

        if(this._for1_ == oldChild)
        {
            setFor1((PFor1) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
