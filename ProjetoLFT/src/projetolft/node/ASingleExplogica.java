/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class ASingleExplogica extends PExplogica
{
    private PExpOu _expOu_;

    public ASingleExplogica()
    {
        // Constructor
    }

    public ASingleExplogica(
        @SuppressWarnings("hiding") PExpOu _expOu_)
    {
        // Constructor
        setExpOu(_expOu_);

    }

    @Override
    public Object clone()
    {
        return new ASingleExplogica(
            cloneNode(this._expOu_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASingleExplogica(this);
    }

    public PExpOu getExpOu()
    {
        return this._expOu_;
    }

    public void setExpOu(PExpOu node)
    {
        if(this._expOu_ != null)
        {
            this._expOu_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expOu_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expOu_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expOu_ == child)
        {
            this._expOu_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expOu_ == oldChild)
        {
            setExpOu((PExpOu) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
