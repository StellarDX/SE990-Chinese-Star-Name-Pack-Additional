// Object * zet CMa  ---  Cepheid Variable  ---  OID=@882380   (@@13374,7)  ---  coobox=7719 
// Object types: Pulsating Variable,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,Double or Multiple Star,Cepheid Variable,Star,Infra-Red Source,UV-emission Source 
Remove "Furud A" {ParentBody "Furud"}
Remove "ZET CMa B" {ParentBody "Furud"}
Star "ZET CMa A"
{
	DateUpdated     "2024-07-20"
	ParentBody      "ZET CMa"
	Class           "B2.5V"
	AbsMagn         -2.21
	MassSol         7.7
	RadSol          3.9
	LumBol          3603
	Teff            18700
	Age             0.032

	BinaryOrbit     
	{
		PeriodDays      675
		Eccentricity    0.57
		Epoch           2416508
		ArgOfPericenter 27
		MeanAnomaly     0
	}
}

Star "ZET CMa B"
{
	ParentBody      "ZET CMa"
	Class           "B9.7?"
}

// Object * del Col  ---  Spectroscopic Binary  ---  OID=@882651   (@@13080,0)  ---  coobox=7727 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "DEL Col A" {ParentBody "DEL Col"}
Remove "DEL Col B" {ParentBody "DEL Col"}
Star "DEL Col A"
{
	DateUpdated     "2024-07-20"
	ParentBody      "HIP 30277"
	Class           "G7II"
	AbsMagn         -0.32
	MassKg          5.34423734114986e+30 // log(g) = 2.49 cm/^2
	Radius          10743498.5717455 // 计算的值
	LumBol          149.5
	Teff            5136
	FeH             -0.04

	BinaryOrbit     
	{
		PeriodDays      868.78
		Separation      0.622049893259193 // 9.02 mas
		Eccentricity    0.7
		Inclination     116.3
		Epoch           2419915.02
		ArgOfPericenter 287.1
		MeanAnomaly     0
	}
}

Star "DEL Col B"
{
	ParentBody      "HIP 30277"
	Class           "M2.4?"
}