// Object * 1 Del A  ---  Star  ---  OID=@9215291   (@@-1,255)  ---  coobox=20169 
// Object types: Double or Multiple Star,Star 
Star "1 Del A/CCDM J20303+1054A/** BU 63A/BD+10 4303A/HD 195325A/WDS J20303+1054A/TYC 1091-1875-1/Gaia DR2 1753792931170644352"
{
	DateUpdated     "2024-06-09"
	ParentBody      "1 Del"
	Parallax        5.001
	AppMagn         6.2
	Class           "A1III"
	AbsMagn         -0.3 // 计算的值
	MassSol         3.1
	Radius          3000151.80602342 // log(g) = 3.66 cm/s^2
	LumBol          215.62428432913674 // 计算的值
	Teff            10651
	FeH             0.00
	Age             0.246

	BinaryOrbit     
	{
		Separation      193.621260645716 // 0.85 asec
	}
}

// Object * 1 Del B  ---  Star  ---  OID=@6509884   (@@-1,255)  ---  coobox=20169 
// Object types: Double or Multiple Star,Star 
Star "1 Del B/TYC 1091-1875-2/BD+10 4303B/** BU 63B/CCDM J20303+1054B/HD 195325B/WDS J20303+1054B/Gaia DR2 1753792926878732672"
{
	ParentBody      "1 Del"
	Class           "F9.3?"
}

// Object * 14 Del  ---  Spectroscopic Binary  ---  OID=@2710439   (@@62449,4)  ---  coobox=20157 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Spectroscopic Binary,Star,UV-emission Source 
Star "14 Del A"
{
	DateUpdated     "2024-06-09"
	ParentBody      "14 Del"
	Class           "A1Vs"
	AbsMagn         0.385 // 计算的值
	MassKg          4.29495938303836e+30 // log(g) = 3.787 cm/s^2
	RadSol          3.11 // Gaia DR3
	LumBol          86.6871362025837 // 计算的值
	Teff            9987
	FeH             -0.855

	BinaryOrbit // 计算的值
	{
		RefPlane        "Equator"
		SemiMajorAxis   64.0385583
		Eccentricity    0.414674544
		Inclination     -1.28492737
		AscendingNode   0
		ArgOfPericenter 61.6790099
		MeanAnomaly     58.0234582
	}
}

Star "14 Del B"
{
	ParentBody      "14 Del"
	Class           "F3.4?"
}

// Object * 13 Del  ---  Star  ---  OID=@2693790   (@@62456,7)  ---  coobox=20147 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Variable Star,Double or Multiple Star,Star,UV-emission Source 
Remove "13 Del A" {ParentBody "13 Del"}
Remove "13 Del B" {ParentBody "13 Del"}
Star "13 Del A"
{
	DateUpdated     "2024-06-09"
	ParentBody      "Gaia DR3 1735906350890358144"
	Class           "A0V"
	AbsMagn         -0.01
	MassSol         2.51
	RadSol          3.7
	LumBol          119
	Teff            9840
	FeH             0.00
	Age             0.307

	BinaryOrbit     
	{
		Epoch           2457389
		Separation      216.559860558122 // 1.5 asec
		PositionAngle   200
	}
}

// Object * 13 Del B  ---  Star  ---  OID=@8447723   (@@-1,255)  ---  coobox=20147 
// Object types: Double or Multiple Star,Star 
Star "13 Del B/Gaia DR3 1735906346597502464/** BU 65B/CCDM J20478+0600B/WDS J20478+0600B/TYC 524-2807-2/Gaia DR2 1735906346597502464"
{
	ParentBody      "Gaia DR3 1735906350890358144"
	Class           "K5.2?"
}