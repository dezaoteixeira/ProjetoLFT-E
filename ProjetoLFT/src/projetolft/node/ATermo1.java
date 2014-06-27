/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class ATermo1 extends PTermo1
{
    private PMult _mult_;
    private PFator _fator_;
    private PTermo1 _termo1_;

    public ATermo1()
    {
        // Constructor
    }

    public ATermo1(
        @SuppressWarnings("hiding") PMult _mult_,
        @SuppressWarnings("hiding") PFator _fator_,
        @SuppressWarnings("hiding") PTermo1 _termo1_)
    {
        // Constructor
        setMult(_mult_);

        setFator(_fator_);

        setTermo1(_termo1_);

    }

    @Override
    public Object clone()
    {
        return new ATermo1(
            cloneNode(this._mult_),
            cloneNode(this._fator_),
            cloneNode(this._termo1_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATermo1(this);
    }

    public PMult getMult()
    {
        return this._mult_;
    }

    public void setMult(PMult node)
    {
        if(this._mult_ != null)
        {
            this._mult_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mult_ = node;
    }

    public PFator getFator()
    {
        return this._fator_;
    }

    public void setFator(PFator node)
    {
        if(this._fator_ != null)
        {
            this._fator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fator_ = node;
    }

    public PTermo1 getTermo1()
    {
        return this._termo1_;
    }

    public void setTermo1(PTermo1 node)
    {
        if(this._termo1_ != null)
        {
            this._termo1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termo1_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._mult_)
            + toString(this._fator_)
            + toString(this._termo1_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._mult_ == child)
        {
            this._mult_ = null;
            return;
        }

        if(this._fator_ == child)
        {
            this._fator_ = null;
            return;
        }

        if(this._termo1_ == child)
        {
            this._termo1_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._mult_ == oldChild)
        {
            setMult((PMult) newChild);
            return;
        }

        if(this._fator_ == oldChild)
        {
            setFator((PFator) newChild);
            return;
        }

        if(this._termo1_ == oldChild)
        {
            setTermo1((PTermo1) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
