// Object * 42 Cap  ---  RS CVn Variable  ---  OID=@1291575   (@@26451,1)  ---  coobox=8495 
// Object types: High Proper Motion Star,High Proper Motion Star,Spectroscopic Binary,Variable Star,RS CVn Variable,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "42 Cap A"
{
	DateUpdated     "2024-06-11"
	ParentBody      "42 Cap"
	Class           "G1IV"
	AbsMagn         2.79
	MassSol         1.09
	RadSol          2.6
	LumBol          6.136316403590804 // 计算的值
	Teff            5634
	FeH             -0.10
	Age             6.7

	BinaryOrbit     
	{
		PeriodDays      13.174
		Eccentricity    0.1763
		Epoch           2447863.626
		ArgOfPericenter 346.45
		MeanAnomaly     0
	}
}

Star "42 Cap B"
{
	ParentBody      "42 Cap"
	Class           "G2V"
}

// Object * 45 Cap  ---  Double or Multiple Star  ---  OID=@1291594   (@@26452,5)  ---  coobox=8495 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "45 Cap A"
{
	DateUpdated     "2024-06-12"
	ParentBody      "45 Cap"
	Class           "A7IV/V"
	AbsMagn         2.27 // 计算的值

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.459560559
		Eccentricity    0.354774326
		Inclination     -0.505999088
		AscendingNode   0
		ArgOfPericenter 46.0953748
		MeanAnomaly     -95.8466102
	}
}

Star "45 Cap B"
{
	ParentBody      "45 Cap"
	Class           "F5.7?"
}