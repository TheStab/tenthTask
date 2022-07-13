package code.with.cal.cardviewrecyclerviewtutorial

import androidx.recyclerview.widget.RecyclerView
import code.with.cal.cardviewrecyclerviewtutorial.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
) : RecyclerView.ViewHolder(cardCellBinding.root)
{

        fun bindItem(item: Item) {
            cardCellBinding.modelImg.setImageResource(item.image)
            cardCellBinding.descriptionTxt.text = item.title
            cardCellBinding.priceTxt.text = item.price
        }


}