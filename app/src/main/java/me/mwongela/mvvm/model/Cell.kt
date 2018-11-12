package me.mwongela.mvvm.model

class Cell(player: Player) {

    var player: Player? = player

    fun isEmpty(): Boolean {
        return this.player == null || this.player!!.value.isEmpty()
    }
}