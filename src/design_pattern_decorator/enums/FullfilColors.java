package design_pattern_decorator.enums;

public enum FullfilColors {

	PRATA("Prata"), PRETO("Preto"), AMARELO("Amarelo"), AZUL("Azul");

	private String description;

	FullfilColors(String description) {
		this.description = description;
	}

	public String getDescriptionFullfilColors() {
		return description;
	}
}
