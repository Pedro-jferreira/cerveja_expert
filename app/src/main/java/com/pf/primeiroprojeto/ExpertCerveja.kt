package com.pf.primeiroprojeto


class ExpertCerveja {

    fun getMarcas(color: String): List<String> {
        return when (color) {
            "Pilsen" -> listOf("Skol", "Brahma", "Antarctica")
            "Lager" -> listOf("Heineken", "Amstel", "Bohemia")
            "Weiss" -> listOf("Erdinger", "Paulaner", "Franziskaner")
            "IPA" -> listOf("Colorado Indica", "Goose Island", "Dogma Rizoma")
            "Stout" -> listOf("Guinness", "Murphy's", "Colorado Demoiselle")
            else -> listOf("Sem marcas disponíveis")
        }
    }
}