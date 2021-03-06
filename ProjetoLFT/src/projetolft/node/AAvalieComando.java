/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class AAvalieComando extends PComando
{
    private PAvalieEst _avalieEst_;
    private PComando _comando_;

    public AAvalieComando()
    {
        // Constructor
    }

    public AAvalieComando(
        @SuppressWarnings("hiding") PAvalieEst _avalieEst_,
        @SuppressWarnings("hiding") PComando _comando_)
    {
        // Constructor
        setAvalieEst(_avalieEst_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AAvalieComando(
            cloneNode(this._avalieEst_),
            cloneNode(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAvalieComando(this);
    }

    public PAvalieEst getAvalieEst()
    {
        return this._avalieEst_;
    }

    public void setAvalieEst(PAvalieEst node)
    {
        if(this._avalieEst_ != null)
        {
            this._avalieEst_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._avalieEst_ = node;
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
            + toString(this._avalieEst_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._avalieEst_ == child)
        {
            this._avalieEst_ = null;
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
        if(this._avalieEst_ == oldChild)
        {
            setAvalieEst((PAvalieEst) newChild);
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
