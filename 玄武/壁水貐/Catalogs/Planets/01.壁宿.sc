// Object * 72 Peg  ---  Double or Multiple Star  ---  OID=@1510900   (@@31675,0)  ---  coobox=10142 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=116310
Star "72 Peg A/ADS 16836 A/BD+30 4978A/CSI+30 4978 2/WDS J23340+3120A/TYC 2766-1925-1/CCDM J23340+3120A/HD 221673A/** BU 720A"
{
	DateUpdated     "2024-06-17"
	ParentBody      "72 Peg"
	Class           "K4III"
	AbsMagn         -1.15
	MassSol         2
	Radius          28449861.4806186 // 计算的值
	LumBol          554
	Teff            4379
	FeH             0.06

	BinaryOrbit // VB6_Mut2010e BU_720 Gr.4
	{
		Period          492.31
		Separation      95.6226458822807 // 0.568 asec
		Eccentricity    0.322
		Inclination     21.7
		AscendingNode   56.2
		Epoch           2416817.305138002615422
		ArgOfPericenter 113.0
		MeanAnomaly     0
	}
}

// Object * 72 Peg B  ---  High Proper Motion Star  ---  OID=@11630863   (@@-1,255)  ---  coobox=10142 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "72 Peg B/TYC 2766-1925-2/ADS 16836 B/CSI+30 4978 3/IDS 23290+3047 B/WDS J23340+3120B/** BU 720B/CCDM J23340+3120B/HD 221673B"
{
	DateUpdated     "2024-06-17"
	ParentBody      "72 Peg"
	Class           "K4III"
	MassSol         2
}

Star "72 Peg Bb"
{
	DateUpdated     "2024-06-17"
	ParentBody      "72 Peg B"
	Class           ""
	MassSol         0.05

	Orbit // VB6_Mut2010e BU_720B Gr.9
	{
		Period          4.2136
		Eccentricity    0.000
		Inclination     66.6
		AscendingNode   128.3
		Epoch           2453355.404219656251371
		ArgOfPericenter 0.0
		MeanAnomaly     0
	}
}

// Object * 78 Peg  ---  Double or Multiple Star  ---  OID=@1501424   (@@31422,5)  ---  coobox=10162 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "78 Peg A"
{
	DateUpdated     "2024-06-17"
	ParentBody      "78 Peg"
	Class           "K0III"
	AbsMagn         0.75
	MassSol         1.50
	RadSol          10
	LumBol          57.35
	Teff            4898
	FeH             0.01

	BinaryOrbit     
	{
		Period          630.15
		Separation      111.004101922618 // 1.614 asec
		Eccentricity    0.112
		Inclination     60.64
		AscendingNode   172.55
		Epoch           2542018.678458141628653
		ArgOfPericenter 61.27
		MeanAnomaly     0
	}
}

Star "78 Peg B"
{
	ParentBody      "78 Peg"
	Class           "A6.6?"
}

// Object * 85 Peg  ---  Spectroscopic Binary  ---  OID=@1492688   (@@133385,0)  ---  coobox=11525 
// Object types: Rotating Variable,Spectroscopic Binary,High Proper Motion Star,Double or Multiple Star,Variable Star,Mid-IR Source (3 to 30 µm),High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "85 Peg A" {ParentBody "85 Peg"}
Remove "85 Peg B" {ParentBody "85 Peg"}
Remove "85 Peg Ba" {ParentBody "85 Peg B"}
Remove "85 Peg Bb" {ParentBody "85 Peg B"}
Star "85 Peg A"
{
	DateUpdated     "2024-06-17"
	ParentBody      "HD 224930"
	Class           "G5VbFe-2"
	AbsMagn         5.32
	MassSol         0.88
	RadSol          0.91
	LumBol          0.61
	Teff            5550
	FeH             -0.23657200643706271745341434230625 // 0.58 - 0.75 Sun
	Age             3.8 // 4.4
}

Barycenter "85 Peg B"
{
	ParentBody      "HD 224930"
	BinaryOrbit     
	{
		Period          26.28
		Separation      10.3
		Eccentricity    0.38
		Inclination     49
	}
}

Star "85 Peg B1"
{
	DateUpdated     "2024-06-17"
	ParentBody      "85 Peg B"
	Class           "K7V"
	MassSol         0.55
	RadSol          0.67
	LumBol          0.05
	Teff            4200

	BinaryOrbit     
	{
		Separation      2
	}
}

Star "85 Peg B2"
{
	DateUpdated     "2024-06-17"
	ParentBody      "85 Peg B"
	Class           ""
	MassSol         0.11
}

// Object * psi Peg  ---  Double or Multiple Star  ---  OID=@1482615   (@@30961,0)  ---  coobox=10155 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source 
Remove "PSI Peg A" {ParentBody "PSI Peg"}
Remove "PSI Peg B" {ParentBody "PSI Peg"}
Star "PSI Peg A"
{
	DateUpdated     "2024-06-18"
	ParentBody      "Gaia DR3 2851617392714906880"
	Class           "M3III"
	AbsMagn         -1.19
	RadSol          98
	LumBol          960
	Teff            3882

	BinaryOrbit     
	{
		Period          55.06
		Separation      26.461625190754 // 0.170 asec
		Eccentricity    0.19
		Inclination     65.6
		AscendingNode   46.6
		Epoch           2452212.926621869206429
		ArgOfPericenter 339.7
		MeanAnomaly     0
	}
}

Star "PSI Peg B"
{
	ParentBody      "Gaia DR3 2851617392714906880"
	Class           "A3.9?"
}

// Object * 48 Psc  ---  Spectroscopic Binary  ---  OID=@1451587   (@@30250,1)  ---  coobox=11367 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source 
Star "48 Psc A"
{
	DateUpdated     "2024-06-18"
	ParentBody      "48 Psc"
	Class           "K5III"
	AbsMagn         -1.52 // 计算的值
	MassKg          9.4653453585773e+30 // log(g) = 1.438 cm/s^2
	RadSol          69 // Gaia DR3
	LumBol          1622.35621788616 // 计算的值
	Teff            4410
	FeH             -0.306

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   98.6314225
		Eccentricity    0.66874128
		Inclination     -0.797377586
		AscendingNode   0
		ArgOfPericenter -110.804009
		MeanAnomaly     -54.4108835
	}
}

Star "48 Psc B"
{
	ParentBody      "48 Psc"
	Class           "B7.9?"
}

// Object * 39 Psc  ---  High Proper Motion Star  ---  OID=@1450042   (@@30219,8)  ---  coobox=11343 
// Object types: High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Star,UV-emission Source,X-ray Source 
Star "39 Psc A"
{
	DateUpdated     "2024-06-18"
	ParentBody      "39 Psc"
	Class           "F6V"
	AbsMagn         3.84 // 计算的值
	MassKg          1.91716281160075e+30 // log(g) = 4.194 cm/s^2
	RadSol          1.3005 // Gaia DR3
	LumBol          2.39883747445755 // 计算的值
	Teff            6299
	FeH             -0.479

	BinaryOrbit     
	{
		Separation      944.715100544786 // 20.07 asec
	}
}

Star "UCAC3 213-1189/Gaia DR3 2793413885703768064/TIC 52052929/UCAC4 532-000572/2MASS J00174885+1619395/** TOK 646B/WDS J00178+1620B/Gaia DR2 2793413885703768064"
{
	DateUpdated     "2024-06-18"
	ParentBody      "39 Psc"
	Class           ""
	MassKg          5.07408838399905e+29 // log(g) = 4.996 cm/s^2
	RadSol          0.2657418 // Gaia DR3
	LumBol          0.00661316101924372 // 计算的值
	Teff            3193
	FeH             -0.127
}