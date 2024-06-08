// Object * 16 Lyr  ---  High Proper Motion Star  ---  OID=@260683   (@@11066,0)  ---  coobox=284 
// Object types: High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "16 Lyr A"
{
	DateUpdated     "2024-06-08"
	ParentBody      "16 Lyr"
	Class           "A6IV"
	AbsMagn         2.13
	MassSol         1.80
	RadSol          1.87
	LumBol          12.043
	Teff            7870
	Age             0.791

	BinaryOrbit // 计算的值
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.05850629
		Eccentricity    0.376284284
		Inclination     -2.20558262
		AscendingNode   0
		ArgOfPericenter -10.7429093
		MeanAnomaly     -56.3592711
	}
}

Star "16 Lyr B"
{
	ParentBody      "16 Lyr"
	Class           "F6.9?"
}

// Object * eta Cyg  ---  Star  ---  OID=@2903812   (@@60607,0)  ---  coobox=20325 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "ETA Cyg A" {ParentBody "ETA Cyg"}
Remove "ETA Cyg B" {ParentBody "ETA Cyg"}
Star "ETA Cyg A"
{
	DateUpdated     "2024-06-08"
	ParentBody      "HIP 98110"
	Class           "K0III"
	AbsMagn         0.74
	MassSol         1.59
	RadSol          11
	LumBol          52.5
	Teff            4783
	FeH             -0.09
	Age             3.29

	BinaryOrbit     
	{
		Epoch           2454102
		Separation      331.23549362699 // 7.80 asec
		PositionAngle   206
	}
}

Star "ETA Cyg B"
{
	ParentBody      "HIP 98110"
	Class           "F2?"
}

// Object * phi Cyg  ---  Spectroscopic Binary  ---  OID=@2846984   (@@59581,14)  ---  coobox=20247 
// Object types: Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "PHI Cyg A"
{
	DateUpdated     "2024-06-08"
	ParentBody      "PHI Cyg"
	Class           "K0III"
	AbsMagn         0.77
	MassSol         2.16
	RadSol          8.9
	LumBol          44
	Teff            4875
	FeH             -0.11

	BinaryOrbit     
	{
		PeriodDays      434.208
		Separation      2.11862559423882 // 26.9 mas
		Eccentricity    0.5557
		Inclination     80.8
		AscendingNode   251
		Epoch           2451239.58
		ArgOfPericenter 29.41
		MeanAnomaly     0
	}
}

Star "PHI Cyg B"
{
	DateUpdated     "2024-06-08"
	ParentBody      "PHI Cyg"
	Class           "K0III"
	AbsMagn         1.07
	MassSol         2.06
	RadSol          7.8
	LumBol          34
	Teff            4875
	Age             0.65
}

// Object * bet01 Cyg  ---  Double or Multiple Star  ---  OID=@2824708   (@@59153,0)  ---  coobox=20241 
// Object types: Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=95947
Remove "Albireo A" {ParentBody "Albireo"}
Remove "Albireo Aa" {ParentBody "Albireo A"}
Remove "Albireo Ab" {ParentBody "Albireo A"}
Remove "Albireo B" {ParentBody "Albireo"}
Barycenter "BET1 Cyg/WISE J193043.45+275736.9/Gaia DR3 2026116260337482112/HIP 95947/** BNU 10/WDS J19307+2758Aa,Ad/WDS J19307+2758Aa,Ab/TIC 112981566/PLX 4567/* 6 Cyg A/* bet Cyg A/ADS 12540 A/AG+27 1969/BD+27 3410/FK5 732/GC 26953/GCRV 11939/GEN# +1.00183912/GSC 02133-02964/HIC 95947/HR 7417/IRAS 19286+2751/IRC +30370/JP11 3109/N30 4327/Albereo/Albireo/NSV 12105/PMC 90-93 521/PPM 109139/RAFGL 2406/ROT 2806/SAO 87301/SKY# 36344/SRS 30732/UBV 16562/YZ 27 10049/2MASS J19304330+2757347/WDS J19307+2758Aa,Ac/CCDM J19307+2758AC/** MCA 55/PMSC 19267+2744Aab/WDS J19307+2758A/** STF 4043A/Gaia DR2 2026116260302988160/WEB 16802"
{
	ParentBody      "BET Cyg"
	BinaryOrbit     
	{
		Epoch           2453736
		Period          59430
		Separation      3930.25741150968 // 35.3 asec
		PositionAngle   54
	}
}

Barycenter "BET1 Cyg A/WDS J19307+2758Aa/TYC 2133-2964-1/HD 183912/CCDM J19307+2758A"
{
	ParentBody      "BET1 Cyg"
	BinaryOrbit // 2021MNRAS.502..328D combined
	{
		Period          121.6500
		Separation      44.6474117131773 // 0.401 asec
		Eccentricity    0.200
		Inclination     156.15
		AscendingNode   84.43
		Epoch           2461172.317757966928184
		ArgOfPericenter 234.72
		MeanAnomaly     0
	}
}

Star "BET1 Cyg Aa"
{
	DateUpdated     "2024-06-08"
	ParentBody      "BET1 Cyg A"
	Class           "K3II"
	AbsMagn         -2.45
	MassSol         5.2
	RadSol          58.69
	LumBol          1259
	Teff            4383
	FeH             -0.1

	BinaryOrbit // 2022A&A...661A..49J
	{
		PeriodDays      371.2000
		Eccentricity    0.062
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2458867.000
		ArgOfPericenter 0.0
		MeanAnomaly     0
	}
}

Star "BET1 Cyg Ab(?)"
{
	ParentBody      "BET1 Cyg A"
	Class           "B8.6?" 
}

Star "BET1 Cyg B/WDS J19307+2758Ac/CCDM J19307+2758C/TYC 2133-2964-2/HD 183913c"
{
	DateUpdated     "2024-06-08"
	ParentBody      "BET1 Cyg"
	Class           "B8:p"
	AbsMagn         -0.25
	MassSol         2.7
	RadSol          3.0
	LumBol          79
	Teff            10000
}

// Object * bet02 Cyg  ---  Be Star  ---  OID=@2824657   (@@59141,11)  ---  coobox=20241 
// Object types: Be Star,Be Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Emission-line Star,Star 
// B可能也有一颗伴星Bb，但后来已证实为观测错误
Star "BET2 Cyg/HIP 95951/Gaia DR3 2026113339752723456/TIC 112981536/[JE82] 1012/* bet Cyg B/* 6 Cyg B/ADS 12540 B/AG+27 1970/BD+27 3411/CCDM J19307+2758B/EM* MWC 618/GC 26956/GCRV 11941/GEN# +1.00183914/GSC 02133-02963/HD 183914/HGAM 758/HIC 95951/HR 7418/PPM 109141/ROT 2807/SAO 87302/SKY# 36345/TYC 2133-2963-1/UBV 16563/UBV M 23852/YZ 27 10052/[KW97] 37-52/uvby98 100183914/2MASS J19304540+2757549/WDS J19307+2758B/** STF 4043B/WDS J19307+2758Ba,Bb/PMSC 19267+2744B/** RBR 12/Gaia DR1 2026113335413644928/WEB 16806/Gaia DR2 2026113339752723456"
{
	DateUpdated     "2024-06-08"
	ParentBody      "BET Cyg"
	Parallax        8.1896
	AppMagn         5.11
	Class           "B8Ve"
	AbsMagn         -0.32 // 计算的值
	MassSol         3.7
	RadSol          2.59
	LumBol          230
	Teff            13200
	Age             0.100
}

// Object * 2 Cyg  ---  Star  ---  OID=@2846302   (@@59129,10)  ---  coobox=19900 
// Object types: Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "2 Cyg A"
{
	DateUpdated     "2024-06-08"
	ParentBody      "2 Cyg"
	Class           "B3IV"
	AbsMagn         -2.06
	MassSol         7.0
	RadSol          5.6
	LumBol          3354
	Teff            16479
	FeH             0.03
	Age             0.0366

	BinaryOrbit // 计算的值
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.09537275
		Eccentricity    0.0830857
		Inclination     -1.7337079
		AscendingNode   0
		ArgOfPericenter -25.7578922
		MeanAnomaly     -158.48701
	}
}

Star "2 Cyg B"
{
	ParentBody      "2 Cyg"
	Class           "A4.3?"
}