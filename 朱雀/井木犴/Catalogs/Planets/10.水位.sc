// Object * 68 Gem  ---  Double or Multiple Star  ---  OID=@986650   (@@19828,7)  ---  coobox=5898 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "68 Gem A"
{
	DateUpdated     "2024-07-19"
	ParentBody      "68 Gem"
	Class           "A1Vp"
	AbsMagn         -0.5 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.120319195
		Eccentricity    0.572401006
		Inclination     1.53946841
		AscendingNode   0
		ArgOfPericenter -120.892107
		MeanAnomaly     -23.1872792
	}
}

Star "68 Gem B"
{
	ParentBody      "68 Gem"
	Class           "F3.4?"
}

// Object * g Gem  ---  Spectroscopic Binary  ---  OID=@1005010   (@@20145,6)  ---  coobox=5894 
// Object types: Spectroscopic Binary,High Proper Motion Star,Double or Multiple Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "81 Gem A"
{
	DateUpdated     "2024-07-19"
	ParentBody      "81 Gem"
	Class           "K4III"
	AbsMagn         -0.19
	MassSol         1.22
	RadSol          33.7
	LumBol          287.3
	Teff            4095
	FeH             -0.18
	Age             6.32

	BinaryOrbit     
	{
		PeriodDays      1519.7
		SemiMajorAxisKm 1.42E8
		Eccentricity    0.325
		Epoch           2441584
		ArgOfPericenter 253
		MeanAnomaly     0
	}
}

Star "81 Gem B"
{
	ParentBody      "81 Gem"
	Class           "F0?"
}

// Object NAME 3 Cnc b  ---  Extra-solar Planet Candidate  ---  OID=@16480452   (@@-1,255)  ---  coobox=5907
// Object types: Extra-solar Planet Candidate
Planet "3 Cnc b"
{
	ParentBody     "3 Cnc"
	DiscMethod     "RadVel"
	DiscDate       "2020"
	MassJup        20.76

	Orbit
	{
		Epoch           2453806.7
		PeriodDays      853.64
		SemiMajorAxis   2.52
		Eccentricity    0.04
		ArgOfPericen    275.18
	}
}