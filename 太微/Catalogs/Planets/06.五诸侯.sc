// Object * 35 Com  ---  Spectroscopic Binary  ---  OID=@1990646   (@@41404,0)  ---  coobox=13889 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=112033
Barycenter "35 Com AB"
{
	ParentBody      "35 Com"
	BinaryOrbit     
	{
		Period          46460
		Separation      2372.07219774881 // 28.62 asec
	}
}

// Object * 35 Com A  ---  High Proper Motion Star  ---  OID=@8453670   (@@-1,255)  ---  coobox=13889 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Barycenter "35 Com A/Gaia DR3 3942757338955937408/TYC 1455-1412-1/BD+22 2519A/HD 112033A/** STF 1687A/CCDM J12533+2115A/WDS J12533+2115A/Gaia DR2 3942757338955937408"
{
	ParentBody      "35 Com AB"
	BinaryOrbit     
	{
		Period          539.4
		Separation      116.448670430911 // 1.405 asec
		Eccentricity    0.208
		Inclination     28.4
		AscendingNode   238.7
		Epoch           2433063.278139781206846
		ArgOfPericenter 71.6
		MeanAnomaly     0
	}
}

Star "35 Com A1"
{
	DateUpdated     "2024-05-05"
	ParentBody      "35 Com A"
	Parallax        12.0654
	AppMagn         5.15
	Class           "G7III"
	AbsMagn         0.56 // 计算的值
	MassSol         2.95

	BinaryOrbit // SB9_3068 2012MNRAS.422...14H
	{
		PeriodDays      2908.2500
		Eccentricity    0.631
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2451417.199
		ArgOfPericenter 347.5
		MeanAnomaly     0
	}
}

Star "35 Com A2"
{
	ParentBody      "35 Com A"
	Class           ""
	MassSol         0.68
}

// Object * 35 Com B  ---  High Proper Motion Star  ---  OID=@8453671   (@@-1,255)  ---  coobox=13889 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "35 Com B/TYC 1455-1412-2/BD+22 2519B/HD 112033B/** STF 1687B/CCDM J12533+2115B/WDS J12533+2115B/Gaia DR2 3942757334664656512"
{
	DateUpdated     "2024-05-05"
	ParentBody      "35 Com AB"
	Class           "F6:"
	MassSol         1.62
}

// Object * 35 Com C  ---  High Proper Motion Star  ---  OID=@1990699   (@@41409,1)  ---  coobox=13889 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,UV-emission Source 
Star "35 Com C/Gaia DR3 3942757338955937280/WISEA J125319.29+211424.5/TIC 198485471/FAUST NGP-27/GSC 01455-01413/TYC 1455-1413-1/WDS J12533+2115C/ADS 8695 C/AG+21 1323/BD+22 2519C/CCDM J12533+2115C/CSI+22 2519 1/GEN# +1.00112033C/PPM 102231/SAO 82551/UBV 11609/YZ 21 4636/HD 112033C/2MASS J12531939+2114245/PMSC 12484+2147C/** STF 1687C/UCAC2 39321200/UCAC3 223-114466/UCAC4 557-051043/WISE J125319.35+211424.5/Gaia DR2 3942757338955937280"
{
	DateUpdated     "2024-05-05"
	ParentBody      "35 Com"
	Parallax        11.6289
	AppMagn         9.36
	Class           ""
	AbsMagn         4.69 // 计算的值
	MassKg          1.80953675437757e+30 // log(g) = 4.412 cm/s^2
	RadSol          0.983025 // Gaia DR3
	LumBol          0.837999162525235 // 计算的值
	Teff            5570
	FeH             0.077
}

// Object * 24 Com A  ---  Variable Star  ---  OID=@1959995   (@@40091,7)  ---  coobox=13852 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source 
Star "24 Com A"
{
	DateUpdated     "2024-05-05"
	ParentBody      "24 Com"
	Class           "K0II-III"
	AbsMagn         0.30
	MassSol         4.40
	RadSol          19.95
	LumBol          173.3
	Teff            4688
	FeH             -0.09
}

// Object * 24 Com B  ---  Spectroscopic Binary  ---  OID=@1959994   (@@40091,6)  ---  coobox=13852 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Variable Star,Star,UV-emission Source 
Barycenter "24 Com B/HIP 61415/Gaia DR3 3947647760517933824/TIC 159164209/SBC9 730/ADS 8600 B/AG+18 1195/BD+19 2584B/CCDM J12351+1823B/CSI+19 2584 1/CSV 101297/FAUST 3262/FAUST NGP-16/GC 17146/GCRV 7571/GEN# +1.00109510/GSC 01446-02468/HD 109510/HIC 61415/HR 4791/PPM 129165/ROT 3559/SAO 100159/SBC7 468/TD1 16373/TYC 1446-2468-1/UBV 11304/YZ 18 4705/2MASS J12350634+1822375/WDS J12351+1823B/Renson 31760/PMSC 12301+1855Bab/PMSC 12301+1855B/Gaia DR1 3947647756222627712/uvby98 100109510/WEB 10931/Gaia DR2 3947647760517933824"
{
	ParentBody      "24 Com"
	BinaryOrbit     
	{
		Epoch           2458119
		Period          28000
		Separation      1400
		PositionAngle   272
	}
}

Star "24 Com Ba"
{
	DateUpdated     "2024-05-05"
	ParentBody      "24 Com B"
	Parallax        8.9477
	AppMagn         6.276
	Class           "A9V"
	MassSol         1.838
	RadSol          2.28
	LumBol          15.6
	Teff            7630
	FeH             0.54

	BinaryOrbit     
	{
		PeriodDays      7.336673
		//Separation      // 1.007 mas
		Eccentricity    0.2585
		Inclination     61.40
		AscendingNode   136.17
		Epoch           2459361.967
		ArgOfPericenter 302.33
		MeanAnomaly     0
	}
}

Star "24 Com Bb"
{
	DateUpdated     "2024-05-05"
	ParentBody      "24 Com B"
	Class           ""
	MassSol         1.541
	RadSol          1.70
	LumBol          7.2
	Teff            7180
}

// Object * 11 Com  ---  High Proper Motion Star  ---  OID=@1909584   (@@39550,5)  ---  coobox=13839 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "11 Com A" {ParentBody "11 Com"}
Remove "11 Com B" {ParentBody "11 Com"}
Star "11 Com A"
{
	DateUpdated     "2024-05-05"
	ParentBody      "HIP 60202"
	Class           "G8IIIFe-1"
	AbsMagn         -0.02
	MassSol         1.66
	RadSol          15.781
	LumBol          109.51
	Teff            4670
	FeH             -0.51
	Age             1.53

	BinaryOrbit     
	{
		Epoch           2454102
		Separation      865.485805530832 // 8.8 asec
		PositionAngle   44
	}
}

// Object * 11 Com B  ---  High Proper Motion Star  ---  OID=@1909585   (@@39550,6)  ---  coobox=13839 
// Object types: High Proper Motion Star,Double or Multiple Star,Star,Optical Source 
Star "11 Com B/Gaia DR3 3946945413105333632/Gaia DR2 3946945413105333632/ADS 8521 B/BD+18 2592B/CCDM J12207+1748B/CSI+18 2592 2/IDS 12157+1821 B/WDS J12207+1748B/** HO 52B/HD 107383B/SDSS J122043.41+174740.3"
{
	DateUpdated     "2024-05-05"
	ParentBody      "HIP 60202"
	Parallax        10.117
	AppMagn         12.9
	Class           ""
	AbsMagn         7.93 // 计算的值
	MassKg          1.23472153317485e+30 // log(g) = 4.596 cm/s^2
	RadSol          0.657 // Gaia DR3
	LumBol          0.145229603743268 // 计算的值
	Teff            4396
	FeH             -0.351
}

// Object * 11 Com b  ---  Extra-solar Planet  ---  OID=@4071513   (@@-1,255)  ---  coobox=13839
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Remove "11 Com A b" {ParentBody "11 Com A"}
Planet "11 Com Ab/HD 107383b"
{
	ParentBody     "11 Com A"
	DiscMethod     "RadVel"
	DiscDate       "2008"
	MassJup        19.4

	Orbit
	{
		Epoch           2452899.6
		PeriodDays      326.03
		SemiMajorAxis   1.29
		Eccentricity    0.231
		ArgOfPericen    94.8
	}
}