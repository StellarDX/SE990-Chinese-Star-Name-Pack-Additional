// Object * 4 CVn  ---  delta Sct Variable  ---  OID=@1922901   (@@39363,2)  ---  coobox=13330 
// Object types: delta Sct Variable,High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Star,UV-emission Source,UV-emission Source 
Star "4 CVn A"
{
	DateUpdated     "2024-05-06"
	ParentBody      "4 CVn"
	Class           "F3III-IV"
	AbsMagn         0.75
	MassSol         1.0 // 2.0
	RadSol          3.7 // 4.1
	LumBol          295
	Teff            6875
	FeH             -0.05

	BinaryOrbit
	{
		PeriodDays      124.44
		Eccentricity    0.311
		Epoch           2454605
		ArgOfPericenter 250.2
		MeanAnomaly     0
	}
}

Star "4 CVn B"
{
	ParentBody      "4 CVn"
	Class           "A7.6?"
}

// Object HD 114357  ---  Spectroscopic Binary  ---  OID=@2064832   (@@41699,19)  ---  coobox=13424 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source 
Star "HD 114357 A"
{
	DateUpdated     "2024-05-06"
	ParentBody      "HD 114357"
	Class           "K2III"
	AbsMagn         0.865 // 计算的值
	MassKg          1.72233350225939e+30 // log(g) = 2.153 cm/s^2
	RadSol          12.92229 // Gaia DR3
	LumBol          64.8767011802814 // 计算的值
	Teff            4557
	FeH             -0.401

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.969910084
		Eccentricity    0.549453608
		Inclination     -2.25419998
		AscendingNode   0
		ArgOfPericenter 136.939416
		MeanAnomaly     70.3807584
	}
}

Star "HD 114357 B"
{
	ParentBody      "HD 114357"
	Class           "M9.2?"
}