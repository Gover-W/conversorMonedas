public record MonedaConver(String base_code, String target_code, float conversion_result) {
    @Override
    public String toString() {
        return "MonedaConver{" +
                "Moneda Base='" + base_code + '\'' +
                ", Moneda a convertir='" + target_code + '\'' +
                ", Monto convertido=" + conversion_result +
                '}';
    }
}
