/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class AExp5TermoExp extends PTermoExp
{
    private PTermoExp _termoExp_;
    private TMenorQue _menorQue_;
    private PExpA _expA_;

    public AExp5TermoExp()
    {
        // Constructor
    }

    public AExp5TermoExp(
        @SuppressWarnings("hiding") PTermoExp _termoExp_,
        @SuppressWarnings("hiding") TMenorQue _menorQue_,
        @SuppressWarnings("hiding") PExpA _expA_)
    {
        // Constructor
        setTermoExp(_termoExp_);

        setMenorQue(_menorQue_);

        setExpA(_expA_);

    }

    @Override
    public Object clone()
    {
        return new AExp5TermoExp(
            cloneNode(this._termoExp_),
            cloneNode(this._menorQue_),
            cloneNode(this._expA_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExp5TermoExp(this);
    }

    public PTermoExp getTermoExp()
    {
        return this._termoExp_;
    }

    public void setTermoExp(PTermoExp node)
    {
        if(this._termoExp_ != null)
        {
            this._termoExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termoExp_ = node;
    }

    public TMenorQue getMenorQue()
    {
        return this._menorQue_;
    }

    public void setMenorQue(TMenorQue node)
    {
        if(this._menorQue_ != null)
        {
            this._menorQue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._menorQue_ = node;
    }

    public PExpA getExpA()
    {
        return this._expA_;
    }

    public void setExpA(PExpA node)
    {
        if(this._expA_ != null)
        {
            this._expA_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expA_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._termoExp_)
            + toString(this._menorQue_)
            + toString(this._expA_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._termoExp_ == child)
        {
            this._termoExp_ = null;
            return;
        }

        if(this._menorQue_ == child)
        {
            this._menorQue_ = null;
            return;
        }

        if(this._expA_ == child)
        {
            this._expA_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._termoExp_ == oldChild)
        {
            setTermoExp((PTermoExp) newChild);
            return;
        }

        if(this._menorQue_ == oldChild)
        {
            setMenorQue((TMenorQue) newChild);
            return;
        }

        if(this._expA_ == oldChild)
        {
            setExpA((PExpA) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
