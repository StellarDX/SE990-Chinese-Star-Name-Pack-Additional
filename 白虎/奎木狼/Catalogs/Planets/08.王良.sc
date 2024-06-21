// Object * 6 Cas A  ---  Evolved Supergiant  ---  OID=@11635524   (@@-1,255)  ---  coobox=760 
// Object types: Evolved Supergiant,Double or Multiple Star,Star 
Star "6 Cas A/Gaia DR3 2012942564813958656/TYC 4285-3744-1/ADS 17022 A/BD+61 2533A/CSI+61 2533 3/GCRV 14909/HD 223385A/WDS J23488+6213A/** STT 508A/Gaia DR2 2012942564813958656"
{
	DateUpdated     "2024-06-21"
	ParentBody      "6 Cas"
	Parallax        0.4264
	AppMagn         5.59
	Class           "A2.5Ia+"
	AbsMagn         -8.30
	MassSol         22.0
	RadSol          193
	LumBol          200000
	Teff            10023
	FeH             0.29

	BinaryOrbit // B可能是光学伴星
	{
		Separation      3517.82074500804 // 1.50 asec
	}
}

// Object * 6 Cas B  ---  Star  ---  OID=@163530   (@@5476,14)  ---  coobox=760 
// Object types: Double or Multiple Star,Star 
Star "6 Cas B/Gaia DR3 2012942564808184832/ADS 17022 B/BD+61 2533B/CSI+61 2533 4/GCRV 14910/HD 223385B/IDS 23440+6140 B/WDS J23488+6213B/** STT 508B/TYC 4285-3744-2/WEB 20686/Gaia DR2 2012942564808184832"
{
	DateUpdated     "2024-06-21"
	ParentBody      "6 Cas"
	Parallax        0.2742
	AppMagn         7.9
	Class           "O9.5II" // O9.75
	AbsMagn         -5.8
}

// Object HD 2054  ---  Spectroscopic Binary  ---  OID=@44608   (@@4724,5)  ---  coobox=2075 
// Object types: Spectroscopic Binary,Pulsating Variable,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,Star 
Star "HD 2054 A"
{
	DateUpdated     "2024-06-21"
	ParentBody      "HD 2054"
	Class           "B9IV"
	AbsMagn         -0.76 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.2965895
		Eccentricity    0.340884292
		Inclination     -1.44592166
		AscendingNode   0
		ArgOfPericenter 71.9451905
		MeanAnomaly     -113.042636
	}
}

Star "HD 2054 B"
{
	ParentBody      "HD 2054"
	Class           "B8.5?"
}