// Object * 15 Sgr  ---  Blue Supergiant  ---  OID=@2536332   (@@56106,0)  ---  coobox=18697 
// Object types: Blue Supergiant,Spectroscopic Binary,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star,UV-emission Source 
Star "15 Sgr A"
{
	DateUpdated     "2024-05-31"
	ParentBody      "15 Sgr"
	Class           "O9.7Iab"
	AbsMagn         -4.92 // 计算的值
	MassSol         30
	RadSol          28.6
	LumBol          4.47E5
	Teff            28000

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.346500196
		Eccentricity    0
		Inclination     0.303494453
		AscendingNode   0
		ArgOfPericenter -175.445204
		MeanAnomaly     -121.331203
	}
}

Star "15 Sgr B"
{
	ParentBody      "15 Sgr"
	Class           "O7?"
}

// Object * 21 Sgr  ---  Star  ---  OID=@2537401   (@@56104,18)  ---  coobox=18721 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "21 Sgr A"
{
	DateUpdated     "2024-05-31"
	ParentBody      "21 Sgr"
	Class           "K1III"
	AbsMagn         -0.67
	MassSol         7.9
	Radius          23128552.1115407 // 计算的值
	LumBol          320
	Teff            4234

	BinaryOrbit     
	{
		Epoch           2454467
		Separation      250.615556906887 // 1.7 asec
		PositionAngle   280
	}
}

Star "21 Sgr B/TYC 6274-1663-2/** JC 6B/ADS 11325 B/CCDM J18254-2033B/HD 169421B/WDS J18254-2033B/Gaia DR2 4091210409677972992"
{
	DateUpdated     "2024-05-31"
	ParentBody      "21 Sgr"
	Class           "A5:"
}