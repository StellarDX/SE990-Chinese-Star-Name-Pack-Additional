// Object * 15 Ori  ---  Double or Multiple Star  ---  OID=@763608   (@@19180,5)  ---  coobox=4917 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "15 Ori A"
{
	DateUpdated     "2024-07-04"
	ParentBody      "15 Ori"
	Class           "F2IV"
	AbsMagn         -0.04
	MassSol         3.42
	RadSol          5.9
	LumBol          300
	Teff            7161
	FeH             0.21

	BinaryOrbit     
	{
		Separation      30.4766360630063 // 0.3 asec
	}
}

Star "15 Ori B"
{
	ParentBody      "15 Ori"
	Class           "F9.2?"
}

// Object * h Ori  ---  Spectroscopic Binary  ---  OID=@768976   (@@18534,0)  ---  coobox=5012 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Star,Infra-Red Source,UV-emission Source 
Star "16 Ori A"
{
	DateUpdated     "2024-07-04"
	ParentBody      "16 Ori"
	Class           "A2m"
	AbsMagn         1.8 // 计算的值
	MassKg          3.20608775318546e+30 // log(g) = 3.869 cm/s^2
	RadSol          2.444942 // Gaia DR3
	LumBol          17.2594100911438 // 计算的值
	Teff            7524
	FeH             -0.38

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.527835141
		Eccentricity    0.490351187
		Inclination     -1.83547354
		AscendingNode   0
		ArgOfPericenter 6.9366738
		MeanAnomaly     -164.904173
	}
}

Star "16 Ori B"
{
	ParentBody      "16 Ori"
	Class           "F6.8?"
}

// Object * i Ori  ---  Double or Multiple Star  ---  OID=@768993   (@@18535,7)  ---  coobox=5014 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=ADS&number=3711
Barycenter "14 Ori AB"
{
	ParentBody      "14 Ori"
	BinaryOrbit     
	{
		Period          1.046E6
		Separation      21700.1890314232 // 347.70 asec
	}
}

// Object * i Ori A  ---  High Proper Motion Star  ---  OID=@769197   (@@83248,21)  ---  coobox=5014 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "i Ori A/WDS J05079+0830A/ADS 3712 A/Renson 8450/BD+08 866A/PMSC 05024+0822A/TYC 698-2328-1"
{
	DateUpdated     "2024-07-04"
	ParentBody      "14 Ori AB"
	Class           "A5m" // kA4hF0mF5(III)Eu
	AbsMagn         1.82 // 计算的值
	MassSol         1.71

	BinaryOrbit // VB6_Sca2008d STT_98 Gr.2
	{
		Period          197.45
		Separation      62.7228672805398 // 1.005 asec
		Eccentricity    0.175
		Inclination     142.8
		AscendingNode   88.3
		Epoch           2443045.347432466223836
		ArgOfPericenter 62.8
		MeanAnomaly     0
	}
}

// Object * i Ori B  ---  High Proper Motion Star  ---  OID=@11612720   (@@-1,255)  ---  coobox=5014 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "i Ori B/TYC 698-2328-2/WDS J05079+0830B/ADS 3712 B/PMSC 05024+0822B"
{
	DateUpdated     "2024-07-04"
	ParentBody      "14 Ori AB"
	Class           ""
	MassSol         1.42
}

// Object HD 33055  ---  Double or Multiple Star  ---  OID=@768994   (@@18535,8)  ---  coobox=5014 
// Object types: Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Barycenter "HD 33055/WISE J050755.05+082407.5/TIC 284857969/2MASS J05075506+0824082/ADS 3712 AB/AG+08 558/BD+08 867/CCDM J05079+0824AB/GC 6270/IDS 05025+0816 AB/PPM 148486/SAO 112442/UBV 4925/YZ 8 2004/WDS J05079+0824AB/** STF 643AB/GEN# +1.00033055HD  33055 A"
{
	ParentBody      "14 Ori"
}

// Object HD 33055A  ---  High Proper Motion Star  ---  OID=@6449841   (@@-1,255)  ---  coobox=5014 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "HD 33055A/Gaia DR3 3290081910949989888/TYC 698-538-1/Gaia DR1 3290081906654296320/CCDM J05079+0824A/** STF 643A/WDS J05079+0824A/Gaia DR2 3290081910949989888"
{
	DateUpdated     "2024-07-04"
	ParentBody      "HD 33055"
	Parallax        18.7221
	AppMagn         9.48
	Class           "K2"
	AbsMagn         5.84 // 计算的值
	MassKg          1.58135413402117e+30 // log(g) = 4.507 cm/s^2
	RadSol          0.82375 // Gaia DR3
	LumBol          0.441173450304312 // 计算的值
	Teff            5183
	FeH             -0.003

	BinaryOrbit     
	{
		Separation      135.6684970316 // 2.54 asec
	}
}

// Object HD 33055B  ---  High Proper Motion Star  ---  OID=@6449842   (@@-1,255)  ---  coobox=5014 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "HD 33055B/Gaia DR3 3290081906654767616/TYC 698-538-2/Gaia DR1 3290081906654767616/CCDM J05079+0824B/** STF 643B/WDS J05079+0824B/Gaia DR2 3290081906654767616"
{
	DateUpdated     "2024-07-04"
	ParentBody      "HD 33055"
	Parallax        18.6736
	AppMagn         9.52
	Class           ""
	AbsMagn         5.88 // 计算的值
	MassKg          1.58135413402117e+30 // log(g) = 4.507 cm/s^2
	RadSol          0.82375 // Gaia DR3
	LumBol          0.429710633536174 // 计算的值
	Teff            5149
	FeH             0.028
}
