package design_pattern_decorator.enums;

public enum LineColors {

	VERDE("Verde"), VERMELHO("Vermelho"), AZUL("Azul"), ROXO("Roxo");

	private String description;

	LineColors(String description) {
		this.description = description;
	}

	public String getDescriptionLineColors() {
		return description;
	}
}
