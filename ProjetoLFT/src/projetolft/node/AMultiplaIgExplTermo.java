/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class AMultiplaIgExplTermo extends PExplTermo
{
    private PExplogica _explogica_;
    private PExplTermo _explTermo_;

    public AMultiplaIgExplTermo()
    {
        // Constructor
    }

    public AMultiplaIgExplTermo(
        @SuppressWarnings("hiding") PExplogica _explogica_,
        @SuppressWarnings("hiding") PExplTermo _explTermo_)
    {
        // Constructor
        setExplogica(_explogica_);

        setExplTermo(_explTermo_);

    }

    @Override
    public Object clone()
    {
        return new AMultiplaIgExplTermo(
            cloneNode(this._explogica_),
            cloneNode(this._explTermo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiplaIgExplTermo(this);
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

    public PExplTermo getExplTermo()
    {
        return this._explTermo_;
    }

    public void setExplTermo(PExplTermo node)
    {
        if(this._explTermo_ != null)
        {
            this._explTermo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._explTermo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._explogica_)
            + toString(this._explTermo_);
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

        if(this._explTermo_ == child)
        {
            this._explTermo_ = null;
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

        if(this._explTermo_ == oldChild)
        {
            setExplTermo((PExplTermo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
