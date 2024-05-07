// Object * 49 Leo A  ---  High Proper Motion Star  ---  OID=@13688974   (@@-1,255)  ---  coobox=13186 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Remove "49 Leo A" {ParentBody "49 Leo"}
Remove "49 Leo Aa" {ParentBody "49 Leo A"}
Remove "49 Leo Ab" {ParentBody "49 Leo A"}
Remove "49 Leo B" {ParentBody "49 Leo"}
Barycenter "49 Leo A/Gaia DR3 3869737397365638528/TYC 839-1566-1/** STF 1450A/CCDM J10350+0839A/WDS J10350+0839A/Gaia DR2 3869737397365638528"
{
	ParentBody      "HIP 51802"
	BinaryOrbit     
	{
		Separation      236.176542858926 // 2.16 asec
	}
}

Star "49 Leo Aa"
{
	DateUpdated     "2024-05-07"
	ParentBody      "Gaia DR3 3869737397365638528"
	Class           "A2V"
	AbsMagn         0.458
	MassSol         2.75
	RadSol          3.49
	LumBol          73
	Teff            8616

	BinaryOrbit     
	{
		PeriodDays      2.4450566
		Eccentricity    0.060
		Inclination     66.8
		Epoch           2427160.738
		ArgOfPericenter 115.9
		MeanAnomaly     0
	}
}

Star "49 Leo Ab"
{
	DateUpdated     "2024-05-07"
	ParentBody      "Gaia DR3 3869737397365638528"
	Class           ""
	MassSol         1.05
	RadSol          2.10
	LumBol          6.0
	Teff            6266
	Age             0.850
}

// Object * 49 Leo B  ---  High Proper Motion Star  ---  OID=@6475578   (@@-1,255)  ---  coobox=13186 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "49 Leo B"
{
	DateUpdated     "2024-05-07"
	ParentBody      "HIP 51802"
	Class           ""
	MassSol         1.75
	Radius          1156062.74984471 // log(g) = 4.24 cm/s^2
	LumBol          4.014407233294514 // 计算的值
	Teff            6338
	FeH             -0.24
}

// Object * 34 Sex  ---  Double or Multiple Star  ---  OID=@1751400   (@@36009,13)  ---  coobox=13222 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,UV-emission Source 
Star "34 Sex A"
{
	DateUpdated     "2024-05-07"
	ParentBody      "34 Sex"
	Class           "F6V"
	AbsMagn         2.19 // 计算的值

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.170049428
		Eccentricity    0.364771052
		Inclination     2.46107815
		AscendingNode   0
		ArgOfPericenter -62.497984
		MeanAnomaly     96.3833001
	}
}

Star "34 Sex B"
{
	ParentBody      "34 Sex"
	Class           "F7.6?"
}

// Object * 35 Sex A  ---  Star  ---  OID=@5540418   (@@-1,255)  ---  coobox=13220 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "35 Sex A/Gaia DR3 3858258736489909632/ADS 7902 A/CCDM J10433+0443A/IDS 10382+0516 A/BD+05 2384A/WDS J10433+0445A/PPM 157110/GCRV 6674/TYC 257-1275-1/** STF 1466A/HD 92841A/Gaia DR2 3858258736489909632"
{
	DateUpdated     "2024-05-07"
	ParentBody      "35 Sex"
	Parallax        4.6773
	AppMagn         6.09
	Class           "K2.5III"
	AbsMagn         -0.56 // 计算的值
	MassSol         2.45
	RadSol          25.39
	LumBol          240
	Teff            4512
	FeH             -0.17
}

// Object * 35 Sex B  ---  Spectroscopic Binary  ---  OID=@1751394   (@@36009,7)  ---  coobox=13220 
// Object types: High Proper Motion Star,Spectroscopic Binary,Double or Multiple Star,Spectroscopic Binary,Star 
Barycenter "35 Sex B/Gaia DR3 3858258736489910400/SBC9 2857/ADS 7902 B/AG+05 1555/BD+05 2384B/CCDM J10433+0443B/CSI+05 2384 1/GC 14744/GCRV 6673/IDS 10382+0516 B/PPM 157109/SAO 118448/SKY# 20535/WDS J10433+0445B/TYC 257-256-1/** STF 1466B/HD 92841B/WEB 9553/Gaia DR2 3858258736489910400"
{
	ParentBody      "35 Sex"
	BinaryOrbit     
	{
		Period          23302
		Separation      1460
	}
}

Star "35 Sex Ba"
{
	DateUpdated     "2024-05-07"
	ParentBody      "35 Sex B"
	Parallax        4.5442
	AppMagn         7.01
	Class           "K1II-III"
	AbsMagn         0.3 // 计算的值
	MassSol         2.44
	RadSol          10.15
	LumBol          57.2
	Teff            5030
	FeH             -0.16

	BinaryOrbit     
	{
		PeriodDays      1568.7
		Separation      4.64
		Eccentricity    0.388
		Epoch           2451911
		ArgOfPericenter 131.8
		MeanAnomaly     0
	}
}

Star "35 Sex Bb"
{
	DateUpdated     "2024-05-07"
	ParentBody      "35 Sex B"
	Class           ""
	MassSol         0.58
}