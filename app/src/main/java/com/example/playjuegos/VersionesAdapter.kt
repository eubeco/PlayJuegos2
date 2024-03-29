package com.example.playjuegos

import android.content.Context
import android.widget.TextView
import android.view.ViewGroup
import java.nio.file.Files.size
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ImageView


class VersionesAdapter(context: Context, private val versiones: ArrayList<AndroidVersion>) : ArrayAdapter<AndroidVersion>(context, R.layout.list_item, versiones)
{
    private val mInflater: LayoutInflater

    init {
        this.mInflater = LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        return versiones.size
    }

    override fun getItem(position: Int): AndroidVersion? {
        return versiones[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        var holder: ViewHolder? = null

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item, null)
            holder = ViewHolder()
            holder.hNombre = convertView.findViewById(R.id.idNombre) as TextView
            holder.hImage = convertView.findViewById(R.id.idLogo) as ImageView
            convertView.tag = holder
        }
        else {
            holder = convertView!!.tag as ViewHolder?
        }
        val deporte = getItem(position)
        holder!!.hNombre!!.text = deporte!!.nombre
        holder!!.hImage!!.setImageResource(deporte!!.logo)
        return convertView!!
    }

    internal inner class ViewHolder {
        var hNombre: TextView? = null
        var hImage: ImageView? = null
    }
}