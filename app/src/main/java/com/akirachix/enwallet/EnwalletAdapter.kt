package com.akirachix.enwallet


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExpensesAdapter(val expenseList: List<Expense>) :
    RecyclerView.Adapter<ExpenceViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenceViewHolder {
        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.expenses_list_item, parent, false)
        return ExpenceViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return expenseList.size
    }

    override fun onBindViewHolder(holder: ExpenceViewHolder, position: Int) {
        val expense = expenseList[position]
        holder.tvName.text = expense.name
        holder.tvPrice.text = expense.price.toString()
        holder.tvDate.text = expense.date

    }


}

class ExpenceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvPrice = itemView.findViewById<TextView>(R.id.tvAmount)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)



}









