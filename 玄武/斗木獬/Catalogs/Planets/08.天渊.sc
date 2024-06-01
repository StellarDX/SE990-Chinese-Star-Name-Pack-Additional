// Object * iot Sgr  ---  High Proper Motion Star  ---  OID=@3529636   (@@60532,10)  ---  coobox=24437 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "IOT Sgr A"
{
	DateUpdated     "2024-06-01"
	ParentBody      "IOT Sgr"
	Class           "K0II/III"
	AbsMagn         0.39
	MassSol         1.40
	RadSol          14
	LumBol          87
	Teff            4594
	FeH             -0.26
	Age             4.74

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.88541484
		Eccentricity    0.631309196
		Inclination     1.83445638
		AscendingNode   0
		ArgOfPericenter 67.5487966
		MeanAnomaly     -65.1950421
	}
}

Star "IOT Sgr B"
{
	ParentBody      "IOT Sgr"
	Class           "F0.5?"
}

// Object * tet01 Sgr  ---  Spectroscopic Binary  ---  OID=@2355410   (@@61028,13)  ---  coobox=18994 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "TET1 Sgr A"
{
	DateUpdated     "2024-06-01"
	ParentBody      "TET1 Sgr"
	Class           "B3IV"
	AbsMagn         -1.63
	MassSol         6.6
	RadSol          5.6
	LumBol          2271
	Teff            17900
	Age             0.0328

	BinaryOrbit     
	{
		PeriodDays      2.1051
		Eccentricity    0.00
		Epoch           2411140.645
		ArgOfPericenter 180.00
		MeanAnomaly     0
	}
}

Star "TET1 Sgr B"
{
	ParentBody      "TET1 Sgr"
	Class           "A9.7?"
}