/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class ARepitaComando extends PComando
{
    private PRepitaEst _repitaEst_;
    private PComando _comando_;

    public ARepitaComando()
    {
        // Constructor
    }

    public ARepitaComando(
        @SuppressWarnings("hiding") PRepitaEst _repitaEst_,
        @SuppressWarnings("hiding") PComando _comando_)
    {
        // Constructor
        setRepitaEst(_repitaEst_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new ARepitaComando(
            cloneNode(this._repitaEst_),
            cloneNode(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARepitaComando(this);
    }

    public PRepitaEst getRepitaEst()
    {
        return this._repitaEst_;
    }

    public void setRepitaEst(PRepitaEst node)
    {
        if(this._repitaEst_ != null)
        {
            this._repitaEst_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._repitaEst_ = node;
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
            + toString(this._repitaEst_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._repitaEst_ == child)
        {
            this._repitaEst_ = null;
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
        if(this._repitaEst_ == oldChild)
        {
            setRepitaEst((PRepitaEst) newChild);
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
