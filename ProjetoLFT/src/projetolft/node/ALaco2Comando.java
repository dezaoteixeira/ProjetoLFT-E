/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class ALaco2Comando extends PComando
{
    private PParaEst _paraEst_;
    private PComando _comando_;

    public ALaco2Comando()
    {
        // Constructor
    }

    public ALaco2Comando(
        @SuppressWarnings("hiding") PParaEst _paraEst_,
        @SuppressWarnings("hiding") PComando _comando_)
    {
        // Constructor
        setParaEst(_paraEst_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new ALaco2Comando(
            cloneNode(this._paraEst_),
            cloneNode(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALaco2Comando(this);
    }

    public PParaEst getParaEst()
    {
        return this._paraEst_;
    }

    public void setParaEst(PParaEst node)
    {
        if(this._paraEst_ != null)
        {
            this._paraEst_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._paraEst_ = node;
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
            + toString(this._paraEst_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._paraEst_ == child)
        {
            this._paraEst_ = null;
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
        if(this._paraEst_ == oldChild)
        {
            setParaEst((PParaEst) newChild);
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