// Object * 83 UMa  ---  Long-Period Variable  ---  OID=@529592   (@@7530,2)  ---  coobox=1845 
// Object types: Long-Period Variable,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source 
Star "83 UMa A"
{
	DateUpdated     "2024-05-04"
	ParentBody      "83 UMa"
	Class           "M2III"
	AbsMagn         -1.39
	MassSol         1.1
	RadSol          80
	LumBol          1250
	Teff            3579
	FeH             -0.07

	BinaryOrbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   192.767075
		Eccentricity    0.347573157
		Inclination     0.664688468
		AscendingNode   0
		ArgOfPericenter 35.6773723
		MeanAnomaly     167.761776
	}
}

Star "83 UMa B"
{
	ParentBody      "83 UMa"
	Class           "WD?"
}

// Object * 36 UMa  ---  High Proper Motion Star  ---  OID=@536244   (@@3514,1)  ---  coobox=3484 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "36 UMa A"
{
	DateUpdated     "2024-05-04"
	ParentBody      "36 UMa"
	Class           "F8V"
	AbsMagn         4.29
	MassSol         1.10
	RadSol          1.17
	LumBol          1.69
	Teff            6066
	FeH             -0.09
	Age             4.0

	BinaryOrbit     
	{
		Separation      1589.54540454729 // 122.79 asec
	}
}

// Object * 36 UMa B  ---  High Proper Motion Star  ---  OID=@536243   (@@3514,0)  ---  coobox=3484 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star,Star 
Star "36 UMa B/GJ 394/Gaia DR3 853820948481913472/MCC 30/TIC 416519074/PLX 2457/LSPM J1030+5559/ASCC 189535/AG+56 796/AGKR 9427/BD+56 1458/CCDM J10306+5559B/CSI+56 1459 2/GCRV 6586/GEN# +1.00237903/GEN# +1.00090839B/GSC 03819-01043/HD 237903/IDS 10242+5629 B/NLTT 24505/PPM 32667/SAO 27668/TYC 3819-1043-1/UBV 9676/VVO 151/YZ 56 6374/2MASS J10302530+5559569/USNO-B1.0 1459-00208170/PLX 2457.00/WDS J10306+5559B/** LDS 2863B/UCAC4 730-049457/PM J10304+5559/Gaia DR1 853820944186096384/WEB 9391/Gaia DR2 853820948481913472/Karmn J10304+559"
{
	DateUpdated     "2024-05-04"
	ParentBody      "36 UMa"
	Parallax        77.4072
	Class           "K7Ve"
	AbsMagn         8.2
	MassSol         0.626
	RadSol          0.648
	LumBol          0.10
	Teff            4132
	FeH             -0.08
	Age             5
}

// Object * 40 UMa  ---  Spectroscopic Binary  ---  OID=@535821   (@@3948,0)  ---  coobox=3476 
// Object types: Spectroscopic Binary,Eclipsing Binary,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "40 UMa A"
{
	DateUpdated     "2024-05-04"
	ParentBody      "40 UMa"
	Class           "A8V"
	AbsMagn         1.64 // 计算的值
	MassKg          3.53161719900531e+30 // log(g) = 3.841 cm/s^2
	RadSol          2.650133 // Gaia DR3
	LumBol          16.9100378588868 // 计算的值
	Teff            7190
	FeH             -0.58

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.598350817
		Eccentricity    0.223962309
		Inclination     -2.37411213
		AscendingNode   0
		ArgOfPericenter 64.9302557
		MeanAnomaly     173.345441
	}
}

Star "40 UMa B"
{
	ParentBody      "40 UMa"
	Class           "F2.4?"
}