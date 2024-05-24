// Object * e Boo  ---  Spectroscopic Binary  ---  OID=@2195559   (@@46306,7)  ---  coobox=13743 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source 
Remove "6 Boo A" {ParentBody "6 Boo"}
Remove "6 Boo B" {ParentBody "6 Boo"}
Star "6 Boo A"
{
	DateUpdated     "2024-05-24"
	ParentBody      "HIP 67480"
	Class           "K4III"
	AbsMagn         -0.49
	MassKg          8.51148770802711e+30 // log(g) = 1.910 cm/s^2
	RadSol          38
	LumBol          430.124
	Teff            4050
	FeH             -0.24

	BinaryOrbit     
	{
		PeriodDays      944
		Eccentricity    0.41
		Epoch           2444739.5
		ArgOfPericenter 179
		MeanAnomaly     0
	}
}

Star "6 Boo B"
{
	DateUpdated     "2024-05-24"
	ParentBody      "HIP 67480"
	Class           "M8V"
}

// Object * 1 Boo  ---  High Proper Motion Star  ---  OID=@2162753   (@@45835,2)  ---  coobox=14081 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,X-ray Source 
Star "1 Boo A"
{
	DateUpdated     "2024-05-24"
	ParentBody      "1 Boo"
	Class           "A1V"
	AbsMagn         0.79
	MassSol         2.54
	Radius          1782999.04876472 // 计算的值
	LumBol          56
	Teff            9863
	Age             0.323

	BinaryOrbit     
	{
		Separation      451.078398167139 // 4.660 asec
	}
}

Star "1 Boo B"
{
	DateUpdated     "2024-05-24"
	ParentBody      "1 Boo"
	Class           "Am"
	MassSol         1.02
	Radius          497969.903728063 // 计算的值
	LumBol          0.76
	Teff            6370
	Age             0 // PreMS (HAe?)
}