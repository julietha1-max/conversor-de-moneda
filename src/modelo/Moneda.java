package modelo;
import com.google.gson.annotations.SerializedName;
public class Moneda {


    @SerializedName("base_code")
    private String valor;
    @SerializedName("conversion_rate")
    private String conversion;
    @SerializedName("conversion_result")
    private String conversionFinal;


    @Override
    public String toString() {
        return    conversionFinal ;
    }}
