// Object * 33 Peg  ---  Double or Multiple Star  ---  OID=@1479656   (@@30653,1)  ---  coobox=9640 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "33 Peg A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "33 Peg"
	Class           "F7IV"
	AbsMagn         3.55
	MassSol         1.28
	RadSol          1.29
	LumBol          2.850
	Teff            6169
	FeH             -0.18
	Age             4.1

	BinaryOrbit     
	{
		Period          250
		Separation      15.6
		PositionAngle   0.0
	}
}

Star "33 Peg B"
{
	DateUpdated     "2024-06-15"
	ParentBody      "33 Peg"
	Class           ""
	MassSol         0.80
}

// Object * 65 Peg  ---  Spectroscopic Binary  ---  OID=@1472489   (@@30689,17)  ---  coobox=9942 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,UV-emission Source 
Star "65 Peg A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "65 Peg"
	Class           "B9.5V"
	AbsMagn         -0.4 // 计算的值

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.953528268
		Eccentricity    0.012279419
		Inclination     -2.4511199
		AscendingNode   0
		ArgOfPericenter 154.83431
		MeanAnomaly     5.66479317
	}
}

Star "65 Peg B"
{
	ParentBody      "65 Peg"
	Class           "F1.7?"
}